SUMMARY = "XCCDF files for RHEL, CentOS, Fedora and ScientificLinux"
DESCRIPTION = "Security Content Automation Protocol (SCAP) Security Guide for Redhat/Fedora/CentOS/OracleLinux/ScientificLinux. \
 \
This package contains XCCDF (Extensible Configuration Checklist \
Description Format), OVAL (Open Vulnerability and Assessment \
Language), CPE (Common Platform Enumeration) and DS (Data Stream) \
files to run a compliance test on various Redhat products, CentOS, Oracle Linux, Fedora and ScientificLinux. \
 \
Note that the included profiles are community supplied and not officially supported by SUSE.."
LICENSE = "BSD-3-Clause"

PV = "0.1.69"

RPM_NAME = "scap-security-guide-redhat-0.1.69-1.1.noarch.rpm"
RPM_HASH = "10f04cf34bcd907451ded3c5577477dd7ad472d3e944e1a57874dba697cd2db5c2cf449e89c8509cedd9a622bf4744776b2bb8840d6d8b6dbe4f587d763c4d6f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "scap-security-guide-redhat"

RDEPENDS:${PN} += ""

inherit rpm
