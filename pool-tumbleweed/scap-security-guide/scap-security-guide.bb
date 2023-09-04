SUMMARY = "XCCDF files for SUSE Linux and openSUSE"
DESCRIPTION = "Security Content Automation Protocol (SCAP) Security Guide for SUSE Linux. \
 \
This package contains XCCDF (Extensible Configuration Checklist \
Description Format), OVAL (Open Vulnerability and Assessment \
Language), CPE (Common Platform Enumeration) and DS (Data Stream) \
files to run a compliance test on SLE12, SLE15 and openSUSE \
 \
SUSE supported in this version of scap-security-guide: \
 \
- DISA STIG profile for SUSE Linux Enterprise Server 12 and 15 \
- PCI-DSS profile for SUSE Linux Enterprise Server 12 and 15 \
- HIPAA profile for SUSE Linux Enterprise Server 12 and 15 \
 \
Other profiles, like the CIS profile, are community supplied and \
not officially supported by SUSE."
LICENSE = "BSD-3-Clause"

PV = "0.1.69"

RPM_NAME = "scap-security-guide-0.1.69-1.1.noarch.rpm"
RPM_HASH = "29476e32133b9d1a4120e700106db94d8814d5f80ec5fe5346ab456ba771e5e9c3a92fc19d7c4a7fbb6fe731e86ee582f46ee9904c3f98266f8f888c743695e0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "scap-security-guide"

RDEPENDS:${PN} += "coreutils \
findutils \
gawk \
grep \
sed \
sudo \
zypper"

inherit rpm
