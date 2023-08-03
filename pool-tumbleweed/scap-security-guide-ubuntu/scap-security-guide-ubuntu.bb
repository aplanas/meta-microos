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

PV = "0.1.68"

RPM_NAME = "scap-security-guide-ubuntu-0.1.68-2.1.noarch.rpm"
RPM_HASH = "eb6dc3041a0ac41910ed45fe12690e4056a6efb532967fe8d32e24b48b14129b4034435e30c9ca41416ffd6a4f2d664bf076e56c255d615c93f27ec912b110aa"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "scap-security-guide-ubuntu"

RDEPENDS:${PN} += ""

inherit rpm
