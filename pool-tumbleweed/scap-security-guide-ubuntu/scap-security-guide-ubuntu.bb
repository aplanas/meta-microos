SUMMARY = "XCCDF files for Ubuntu"
DESCRIPTION = "Security Content Automation Protocol (SCAP) Security Guide for Ubuntu. \
 \
This package contains XCCDF (Extensible Configuration Checklist \
Description Format), OVAL (Open Vulnerability and Assessment \
Language), CPE (Common Platform Enumeration) and DS (Data Stream) \
files to run a compliance test on Ubuntu. \
 \
Note that the included profiles are community supplied and not officially supported by SUSE.."
LICENSE = "BSD-3-Clause"

PV = "0.1.69"

RPM_NAME = "scap-security-guide-ubuntu-0.1.69-1.1.noarch.rpm"
RPM_HASH = "3bc3cafd011e3cae1c671cc90d458c550b466fceabc5f459d8eb2c10c4a3651b623f0b4f3dcc6ba6964da2d9260f5a6dc3c394a32eb3c92629b1470683febb83"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "scap-security-guide-ubuntu"

RDEPENDS:${PN} += ""

inherit rpm
