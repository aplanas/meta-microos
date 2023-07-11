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

PV = "0.1.68"

RPM_NAME = "scap-security-guide-redhat-0.1.68-1.1.noarch.rpm"
RPM_HASH = "d2362de8575d5d0158081104a7ca1303b85223ba92357595dd1ae11a7fcc294d3e8cd9f71252d11e62e385000600c34c22f7277439385b84aa54d978eaa4e87c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "scap-security-guide-redhat"

RDEPENDS:${PN} += ""

inherit rpm
