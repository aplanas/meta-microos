SUMMARY = "Lao Unicode Fonts"
DESCRIPTION = "Phetsarath font family for writing Lao script. Founded by \
Ministry of Posts and Telecommunications, Laos."
LICENSE = "OFL-1.1"

PV = "2.00"

RPM_NAME = "phetsarath-fonts-2.00-4.17.noarch.rpm"
RPM_HASH = "611ca7edc0f4dde465b03b497c516eb7043c9206f9066f4bc1bfffedf056e6a51bd62cb6ef29fcec24d49cd07cc848e73c2569b0e3cce19d44a3ed6f7dda0c4d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "phetsarath-fonts"

RDEPENDS:${PN} += "/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
