SUMMARY = "A VDL Mode 2 message decoder and protocol analyzer"
DESCRIPTION = "A VDL Mode 2 message decoder and protocol analyzer. \
 \
Features: \
 * Supports following SDR hardware: \
   - RTLSDR (via rtl-sdr library) \
   - Mirics SDR (via libmirisdr-4) \
   - reads prerecorded IQ data from file \
 * Decodes up to 8 VDL2 channels simultaneously \
 * Outputs messages to standard output or to a file (with optional daily \
   or hourly file rotation) \
 * Outputs ACARS messages to PlanePlotter over UDP/IP socket \
 * Supports message filtering by type or direction (uplink, downlink) \
 * Outputs decoding statistics using Etsy StatsD protocol"
LICENSE = "GPL-3.0-only"

PV = "2.2.0"

RPM_NAME = "dumpvdl2-2.2.0-1.5.aarch64.rpm"
RPM_HASH = "edcf17837985ac9f71e3ab944985b712d6d3b548d05563c7ec2cd74c128b87940a286b86772b082d408477dff5f1fc5fd5135e4fe4fd418fd08f834f710665dd"

RPROVIDES:${PN} += "dumpvdl2 \
dumpvdl2(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libSoapySDR.so.0.8()(64bit) \
libacars-2.so.2()(64bit) \
libc.so.6()(64bit) \
libglib-2.0.so.0()(64bit) \
libm.so.6()(64bit) \
libprotobuf-c.so.1()(64bit) \
librtlsdr.so.0()(64bit) \
libsqlite3.so.0()(64bit) \
libzmq.so.5()(64bit)"

inherit rpm
