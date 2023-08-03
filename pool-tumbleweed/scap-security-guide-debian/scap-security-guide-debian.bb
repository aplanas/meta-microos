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

PV = "0.1.68"

RPM_NAME = "scap-security-guide-debian-0.1.68-2.1.noarch.rpm"
RPM_HASH = "29382f7d612076a241fa4ef5ccfc20d6ec5965f9790413408f73b5d78811fd88f33ee51d420f5c92c5e8f37fee0649d0a814f2eb00e471625e31049d8f7ba56c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "scap-security-guide-debian"

RDEPENDS:${PN} += ""

inherit rpm
