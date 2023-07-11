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

RPM_NAME = "scap-security-guide-ubuntu-0.1.68-1.1.noarch.rpm"
RPM_HASH = "f35646da2f132ffb4aa12f88997b8623f6a6c89502272b8499950a03499665a76d6816a99f0ff8169371b4f4f6a36601ee03edb67f367bc8be96aab35cb9f155"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "scap-security-guide-ubuntu"

RDEPENDS:${PN} += ""

inherit rpm
