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

RPM_NAME = "perl-Types-Path-Tiny-0.006-1.10.noarch.rpm"
RPM_HASH = "70214d18427a8c31f1705b99c33c5e8e7444986cfeba7654dd2564f2670ad52f41070dd5cbf8f6aebdb2ee96f6e8c3319fbe22b3c6b4f4baa78e2c122648b60b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Types--Path--Tiny \
perl-Types-Path-Tiny"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.38.0 \
perl-Path--Tiny \
perl-Type--Library \
perl-Type--Utils \
perl-Types--Standard \
perl-Types--TypeTiny"

inherit rpm
