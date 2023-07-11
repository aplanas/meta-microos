SUMMARY = "Generator for nonisomorphic fusenes and benzenoids"
DESCRIPTION = "Benzene is a program for the efficient generation of all \
nonisomorphic fusenes and benzenoids with a given number of faces. \
Fusenes are planar polycyclic hydrocarbons with all bounded faces \
hexagons. Benzenoids are fusenes that are subgraphs of the hexagonal \
lattice."
LICENSE = "GPL-2.0-or-later"

PV = "20130630"

RPM_NAME = "benzene-20130630-1.11.aarch64.rpm"
RPM_HASH = "7c3f2168ae3c91f96bec958fa66f504732ab6203373c8f5bc75ed23d07833e1b88df3f2efbc7adf91aed3d0d0a88020c8e7ec352cef6f1dc1b87ceb22de82796"

RPROVIDES:${PN} += "benzene"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
