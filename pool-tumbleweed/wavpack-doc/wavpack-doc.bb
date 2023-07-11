SUMMARY = "Documentation files for wavpack, an audio compression format"
DESCRIPTION = "WavPack is an open audio compression format providing lossless, high-quality \
lossy, and unique hybrid compression modes. \
 \
This subpackage contains development documentation for applications that \
want to make use of wavpack."
LICENSE = "BSD-3-Clause"

PV = "5.6.0"

RPM_NAME = "wavpack-doc-5.6.0-1.4.aarch64.rpm"
RPM_HASH = "419cb586fc2d3f752b21545a937d0c786c26fc5c5aeb0fa2f8a719fa4fcd25e12c9edaabf7f464077b3ad5fab5bd24359bad2417eb54956384df8fa440cfc3a5"

RPROVIDES:${PN} += "wavpack-doc"

RDEPENDS:${PN} += "wavpack"

inherit rpm
