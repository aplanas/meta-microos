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

PV = "0.1.69"

RPM_NAME = "scap-security-guide-debian-0.1.69-1.1.noarch.rpm"
RPM_HASH = "048a03acafcd147da029eedd589726a1080cd80ef7dca7fc24ca96b532c2babdd3de7a97e2f4940ecfd1698a8a77b093c523e1012686ba5c10da8544517207c0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "scap-security-guide-debian"

RDEPENDS:${PN} += ""

inherit rpm
