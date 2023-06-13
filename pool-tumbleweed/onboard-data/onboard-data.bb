SUMMARY = "Simple On-screen Keyboard"
DESCRIPTION = "Language model files for the word suggestion feature of Onboard"
LICENSE = "GPL-3.0-only"

PV = "1.4.1"

RPM_NAME = "onboard-data-1.4.1-7.6.noarch.rpm"
RPM_HASH = "cc263bdc5db4299a2a55962fbd8b9bf1dc97db1ffaf7817a11594c12b6b9cba81ff3bad02e3a7ebf90214171f554f2f67ca4333fdb87b21a0da365e95801094b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "onboard-data"

RDEPENDS:${PN} += "onboard"

inherit rpm
