SUMMARY = "Testsuite for vagrant-sshfs"
DESCRIPTION = "This package contains the testsuite for the SSHFS provider for Vagrant. You most \
likely do not want to install this package, unless you want to test \
vagrant-sshfs."
LICENSE = "GPL-2.0-only"

PV = "1.3.7"

RPM_NAME = "vagrant-sshfs-testsuite-1.3.7-3.5.aarch64.rpm"
RPM_HASH = "ba44267d1f8e505d06806351e3c800346573d475728c24f8136a425e8e8d3f27647fad1ab64ebe7663b222853015e5b53a85f107cbd37eeeb4802d4a2ca82eab"

RPROVIDES:${PN} += "vagrant-sshfs-testsuite"

RDEPENDS:${PN} += "/usr/bin/bash \
vagrant-libvirt \
vagrant-sshfs"

inherit rpm
