SUMMARY = "XCCDF files for Debian"
DESCRIPTION = "Security Content Automation Protocol (SCAP) Security Guide for Debian. \
 \
This package contains XCCDF (Extensible Configuration Checklist \
Description Format), OVAL (Open Vulnerability and Assessment \
Language), CPE (Common Platform Enumeration) and DS (Data Stream) \
files to run a compliance test on Debian. \
 \
Note that the included profiles are community supplied and not officially supported by SUSE.."
LICENSE = "BSD-3-Clause"

PV = "0.1.66"

RPM_NAME = "scap-security-guide-debian-0.1.66-1.3.noarch.rpm"
RPM_HASH = "2bff71e0862765a4712cb3592ac4d9fb40c01f887af6589213ed97da95879784e7c3d4ba5a260b358f114454dd6ded488a03a0ddff978b463c971c8dfea672ea"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "scap-security-guide-debian"

RDEPENDS:${PN} += ""

inherit rpm
