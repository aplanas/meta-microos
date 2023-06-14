SUMMARY = "Generator for nonisomorphic fusenes and benzenoids"
DESCRIPTION = "Benzene is a program for the efficient generation of all \
nonisomorphic fusenes and benzenoids with a given number of faces. \
Fusenes are planar polycyclic hydrocarbons with all bounded faces \
hexagons. Benzenoids are fusenes that are subgraphs of the hexagonal \
lattice."
LICENSE = "GPL-2.0-or-later"

PV = "20130630"

RPM_NAME = "benzene-20130630-1.10.aarch64.rpm"
RPM_HASH = "18a4b0d144c7f89dc5cdaeb03e312777efff3a310e9d3dab0b098e07f072280983751e41d8c48eff216fa036146f1379006e198adca9165df357ebe31949e71d"

RPROVIDES:${PN} += "benzene"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
