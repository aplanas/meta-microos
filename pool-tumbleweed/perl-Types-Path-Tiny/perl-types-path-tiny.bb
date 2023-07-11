SUMMARY = "Path::Tiny types and coercions for Moose and Moo"
DESCRIPTION = "This module provides Path::Tiny types for Moose, Moo, etc. \
 \
It handles two important types of coercion: \
 \
  * coercing objects with overloaded stringification \
 \
  * coercing to absolute paths \
 \
It also can check to ensure that files or directories exist."
LICENSE = "Apache-2.0"

PV = "0.006"

RPM_NAME = "perl-Types-Path-Tiny-0.006-1.9.noarch.rpm"
RPM_HASH = "a3e877153ec5058cac231b4debb3148578e1313d3aede90756fb54580e1b1db9889f809e4352c41899d7172d3c3e27b10c563dd8d49622ad9c64c7e34df95187"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Types--Path--Tiny \
perl-Types-Path-Tiny"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.1 \
perl-Path--Tiny \
perl-Type--Library \
perl-Type--Utils \
perl-Types--Standard \
perl-Types--TypeTiny"

inherit rpm
