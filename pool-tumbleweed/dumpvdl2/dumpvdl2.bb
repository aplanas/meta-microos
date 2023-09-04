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

PV = "2.3.0"

RPM_NAME = "dumpvdl2-2.3.0-1.1.aarch64.rpm"
RPM_HASH = "ca4e6df1430474508d21dda6d1ec26b9137d2b820079326e85c2e6b75b99ea660efa28da7af1c62d0d1c515a653d891381ef79125fe790de90678dbf919b54c2"

RPROVIDES:${PN} += "dumpvdl2"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libSoapySDR.so.0.8 \
libacars-2.so.2 \
libc.so.6 \
libglib-2.0.so.0 \
libm.so.6 \
libprotobuf-c.so.1 \
librtlsdr.so.0 \
libsqlite3.so.0 \
libzmq.so.5"

inherit rpm
