SUMMARY = "Data Plane Development Kit API documentation (thunderx)"
DESCRIPTION = "API programming documentation for the Data Plane Development Kit."
LICENSE = "BSD-3-Clause & GPL-2.0-only & LGPL-2.1-only"

PV = "22.11.1"

RPM_NAME = "dpdk-thunderx-doc-22.11.1-2.4.noarch.rpm"
RPM_HASH = "75c588f08db180892e2945f328ef4c289ca1a17860b0526aa91c877513f762a0eab227edbbb2f8e99d93debc650b80c387cc2b3cb9551e2aff221066bfc37675"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "dpdk-any-doc dpdk-thunderx-doc"
RDEPENDS:${PN} += ""

inherit rpm
