SUMMARY = "Development files for libsz2"
DESCRIPTION = "Header files for libsz2, a drop-in replacement for the \
SZIP library (http://www.hdfgroup.org/doc_resource/SZIP)."
LICENSE = "BSD-2-Clause"

PV = "1.0.6"

RPM_NAME = "sz2-devel-1.0.6-1.7.aarch64.rpm"
RPM_HASH = "ddca30fba1b38607eb2efa727f4e880b889e767b484662243856f0a60f6de27cd100ea6d429f6a6f80949187067207dfa544aa17d81b73494c0455f285887197"

RPROVIDES:${PN} += "libsz2-devel \
sz2-devel \
sz2-devel(aarch-64)"

RDEPENDS:${PN} += "libaec-devel \
libsz2"

inherit rpm
