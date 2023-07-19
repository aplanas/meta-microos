SUMMARY = "Binary files of multibibliography"
DESCRIPTION = "Binary files of multibibliography"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn30534"

RPM_NAME = "texlive-multibibliography-bin-2023.20230311.svn30534-93.1.aarch64.rpm"
RPM_HASH = "84b09133c3045f89f44bd45d503ba9ca52b83bdb71a3020652df6373948e5fe478131d72a80ce8d637ddb8fbc09b2b076009518614081c0087e73ec9094a25a2"

RPROVIDES:${PN} += "texlive-multibibliography-bin"

RDEPENDS:${PN} += "texlive-multibibliography"

inherit rpm
