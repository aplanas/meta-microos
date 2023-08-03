SUMMARY = "Client tools for remote openQA management"
DESCRIPTION = "Tools and support files for openQA client script. Client script is \
a convenient helper for interacting with openQA webui REST API."
LICENSE = "GPL-2.0-or-later"

PV = "4.6.1690803816.e47aebd"

RPM_NAME = "openQA-client-4.6.1690803816.e47aebd-1.1.aarch64.rpm"
RPM_HASH = "93b844ed66bbb87551c3093eb6698c8a749142ebf658ade5559527b7a50ef32213a26d392d402a06a09b4ff864eb4366bcb77b584af085d9c6f906c85b32bdce"

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
