SUMMARY = "Binary files of multibibliography"
DESCRIPTION = "Binary files of multibibliography"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn30534"

RPM_NAME = "texlive-multibibliography-bin-2023.20230311.svn30534-93.2.aarch64.rpm"
RPM_HASH = "d8a643375cafe6e05d8defd64648b265ae6b833b9cb1ecbe941fa0bcfded6b6c035efc57439926456c805b8291b7229e1a27d78fe06f4fc53cd7c7da848ae5a6"

RPROVIDES:${PN} += "texlive-multibibliography-bin"

RDEPENDS:${PN} += "texlive-multibibliography"

inherit rpm
