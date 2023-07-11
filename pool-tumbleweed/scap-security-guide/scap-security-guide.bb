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

RPM_NAME = "scap-security-guide-0.1.68-1.1.noarch.rpm"
RPM_HASH = "a31a483614ca56cedf4802ab1f634f77ca8671d4633187bc2f256dbb62a7066cea151f19c25922d5787f56b80b7d6d306d023a6a4b1ab2f32362a50364bd3dc1"
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
