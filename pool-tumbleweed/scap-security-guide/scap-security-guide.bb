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

PV = "0.1.68"

RPM_NAME = "scap-security-guide-0.1.68-2.1.noarch.rpm"
RPM_HASH = "c5d7279d74aca3a99e254821d76256509c52d2f13d12a472c12a1d94859ca3192c57cb04b1dfe3b2ef4ecaa065afb2e5daf82810d5d97d7512c888a7ae847fe2"
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
