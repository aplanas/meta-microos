SUMMARY = "RPM macros for building Rust source packages"
DESCRIPTION = "This package provides the RPM macros for building usable Source RPMs \
of Rust packages."
LICENSE = "MIT"

PV = "15"

RPM_NAME = "rust-srpm-macros-15-2.20.noarch.rpm"
RPM_HASH = "9ea0bf65d752d1032165ec3474e65ac1c606c4f0d72ff7e7a6c766df5b346917bdb3ca1a937345b2821ad74f964843a202b88d258d9e72dd56c95e48f6a3af83"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "rpm-macro-crates-source \
rpm-macro-rust-arches \
rpm-macro-version-no-tilde \
rust-srpm-macros"

RDEPENDS:${PN} += ""

inherit rpm
