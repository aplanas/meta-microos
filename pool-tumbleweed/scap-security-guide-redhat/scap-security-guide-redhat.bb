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

RPM_NAME = "scap-security-guide-redhat-0.1.68-2.1.noarch.rpm"
RPM_HASH = "4dee5e575a00fc661f082c4c7c1be6e6afc1432a14f1e6a07d30e44107273c523be68ef901481163cd441abd1a7a642cf6c1bd9614fc3b005de9899ab1b60a0b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "scap-security-guide-redhat"

RDEPENDS:${PN} += ""

inherit rpm
