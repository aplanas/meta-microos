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

RPM_NAME = "perl-Types-Path-Tiny-0.006-1.8.noarch.rpm"
RPM_HASH = "730b1004ea77f610518bc458196a5e8b940ec54cf709dac45e5ee2cdaff6d0c50940208d0bf887c193bc3265288f858e50a3696c13dfd98d335639650eacd975"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl(Types::Path::Tiny) \
perl-Types-Path-Tiny"

RDEPENDS:${PN} += "perl(:MODULE_COMPAT_5.36.0) \
perl(Path::Tiny) \
perl(Type::Library) \
perl(Type::Utils) \
perl(Types::Standard) \
perl(Types::TypeTiny)"

inherit rpm
