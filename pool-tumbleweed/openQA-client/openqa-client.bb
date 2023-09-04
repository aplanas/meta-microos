SUMMARY = "Client tools for remote openQA management"
DESCRIPTION = "Tools and support files for openQA client script. Client script is \
a convenient helper for interacting with openQA webui REST API."
LICENSE = "GPL-2.0-or-later"

PV = "4.6.1692951551.c933949"

RPM_NAME = "openQA-client-4.6.1692951551.c933949-1.1.aarch64.rpm"
RPM_HASH = "43370b752b9a13436c0d71b7aa84e7ccc15edae3fc8d6f7439537c0c7bab279052e08920b8ec068dc48d111256ac32301202798a7e4c25a09b9b28d4b28be11d"

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
