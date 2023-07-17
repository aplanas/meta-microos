SUMMARY = "Client tools for remote openQA management"
DESCRIPTION = "Tools and support files for openQA client script. Client script is \
a convenient helper for interacting with openQA webui REST API."
LICENSE = "GPL-2.0-or-later"

PV = "4.6.1689162874.c51d4b9"

RPM_NAME = "openQA-client-4.6.1689162874.c51d4b9-1.1.aarch64.rpm"
RPM_HASH = "04be5397f6a178567989e90192e810528bebc59f1b296ab34ff401fd9679a82e0df633a376452749d8f81e6747bef62e35a17e0cf20f055ea1445a4b3fe771bc"

RPROVIDES:${PN} += "openQA-client \
perl-OpenQA--Client \
perl-OpenQA--Client--Archive \
perl-OpenQA--Client--Handler \
perl-OpenQA--Client--Upload \
perl-OpenQA--UserAgent"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/perl \
curl \
git-core \
jq \
openQA-common \
perl-Getopt--Long--Descriptive \
perl-IO--Socket--SSL \
perl-IPC--Run \
perl-JSON--Validator \
perl-LWP--Protocol--https \
perl-LWP--UserAgent \
perl-Test--More \
perl-YAML--PP \
perl-YAML--XS"

inherit rpm
