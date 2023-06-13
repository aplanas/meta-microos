SUMMARY = "Household items stamps collection for Tux Paint"
DESCRIPTION = "tuxpaint-stamps-household package contains a set of 'Rubber Stamp' images \
which can be used with the 'Stamp' tool within Tux Paint."
LICENSE = "GPL-2.0-or-later"

PV = "2021.11.25"

RPM_NAME = "tuxpaint-stamps-household-2021.11.25-1.5.noarch.rpm"
RPM_HASH = "90ce0a57883422f8880ebf442053e1d60858c9f1c80c4f9d75456fb3f12ce32a525480068d200d2d8569cd52f7416f84348fef08cf2742bc9b5a9cae1eda5d50"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tuxpaint-stamps-category \
tuxpaint-stamps-household"

RDEPENDS:${PN} += "tuxpaint-stamps"

inherit rpm
