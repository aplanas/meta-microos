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

RPM_NAME = "scap-security-guide-debian-0.1.68-1.1.noarch.rpm"
RPM_HASH = "8781420d419e78aa6b932682a6ee47572e2f0a595aede16eacc4aff83fd323c9bd0743e752face232981a9eabbe7c62b723143befe87f1b4ae6ea79f5b5e2a27"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "scap-security-guide-debian"

RDEPENDS:${PN} += ""

inherit rpm
