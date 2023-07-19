SUMMARY = "Client tools for remote openQA management"
DESCRIPTION = "Tools and support files for openQA client script. Client script is \
a convenient helper for interacting with openQA webui REST API."
LICENSE = "GPL-2.0-or-later"

PV = "4.6.1689265095.7be7504"

RPM_NAME = "openQA-client-4.6.1689265095.7be7504-1.1.aarch64.rpm"
RPM_HASH = "1667079012e540c8dd5721d86df1cc265e145dafb932d3440f1e0273a8f6eae5a127fbc430713774cf2d1c81701c620bccae1e2b38b2f4683a41718288490f42"

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
