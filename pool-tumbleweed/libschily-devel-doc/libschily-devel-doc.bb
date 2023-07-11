SUMMARY = "Manual pages for libschily functions"
DESCRIPTION = "libschily contains many portability functions used by the Schily \
tools. \
 \
This subpackage contains manual pages for the APIs exposed by libschily."
LICENSE = "CDDL-1.0"

PV = "2022.10.16"

RPM_NAME = "libschily-devel-doc-2022.10.16-47.4.noarch.rpm"
RPM_HASH = "381a326b87a9eb9fd4207697301bc090c8673f48e9a405fa477abc9e2341448c7920dffe665a8447ecb9adce8a41aaa96e11fb34f9679c79f938263d1b51d07a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libschily-devel-doc"

RDEPENDS:${PN} += ""

inherit rpm
