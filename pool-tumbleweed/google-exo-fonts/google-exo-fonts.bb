SUMMARY = "Contemporary Geometric Sans Serif Typeface"
DESCRIPTION = "Exo is a contemporary geometric sans serif typeface that \
tries to convey a technological/futuristic feeling while \
keeping an elegant design. Exo was meant to be a very \
versatile font, so it has 9 weights (the maximum on the web) \
each with a true italic version. It works great as a display \
face but it also works good for small to intermediate size texts. \
 \
Designer: Natanael Gama"
LICENSE = "OFL-1.1"

PV = "0.9pre"

RPM_NAME = "google-exo-fonts-0.9pre-12.17.noarch.rpm"
RPM_HASH = "7a42a01cad5a5821502f4442f7cb923e1cef68579846f601e5b1838c0873afaef507dd921201ac1d3732a1550b461f6961fd8f4a863bfc06fc167f199e5aa737"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "google-exo-fonts"

RDEPENDS:${PN} += "/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
