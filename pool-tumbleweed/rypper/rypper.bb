SUMMARY = "Wrapper around zypper for managing multiple repositories"
DESCRIPTION = "rypper is a wrapper around zypper for performing repository operations \
in batch.  It allows selection of which repositories to operate on via \
a number of different repository selection specifiers."
LICENSE = "GPL-3.0+"

PV = "0.24"

RPM_NAME = "rypper-0.24-1.18.noarch.rpm"
RPM_HASH = "64863b2c1d5581a3637987bc9eaa95261cec5c88fff2e9662df249166eb06e24750aec7f2937ff6685994b2ff4fe049a662929c600cd7b6a16dc5eb77345c708"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "rypper"

RDEPENDS:${PN} += "/usr/bin/perl \
perl \
zypper"

inherit rpm
