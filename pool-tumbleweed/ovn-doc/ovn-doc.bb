SUMMARY = "Open Virtual Network Documentation"
DESCRIPTION = "Contains additional documentation for OVN."
LICENSE = "Apache-2.0"

PV = "23.03.0"

RPM_NAME = "ovn-doc-23.03.0-14.1.noarch.rpm"
RPM_HASH = "c828f51fdb5a6f59f0223ff44fae97da8d161b7479fcba51b1244c797723a7d40255a71d80ee1410cfd7f462e1f543db86842ae7e7c5fc993c79520f9eb5133a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ovn-doc"
RDEPENDS:${PN} += ""

inherit rpm
