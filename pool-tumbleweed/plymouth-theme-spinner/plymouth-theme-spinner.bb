SUMMARY = "Plymouth 'Spinner' theme"
DESCRIPTION = "This package contains the 'spinner' boot splash theme for \
Plymouth."
LICENSE = "GPL-2.0-or-later"

PV = "22.02.122+94.4bd41a3"

RPM_NAME = "plymouth-theme-spinner-22.02.122+94.4bd41a3-10.1.noarch.rpm"
RPM_HASH = "8ae7b9f3a87ca2dae10c5439b040634ac420a20628353bb0d84ad73646ec0109a66e8150b7947761715c40ff76607a247b3b3164006ca1407d23348f52b57595"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "plymouth-theme-spinner"

RDEPENDS:${PN} += "plymouth-plugin-two-step \
plymouth-scripts"

inherit rpm
