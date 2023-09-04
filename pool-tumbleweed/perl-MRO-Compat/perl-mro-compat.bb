SUMMARY = "Mro::* interface compatibility for Perls < 5.9.5"
DESCRIPTION = "The 'mro' namespace provides several utilities for dealing with method \
resolution order and method caching in general in Perl 5.9.5 and higher. \
 \
This module provides those interfaces for earlier versions of Perl (back to \
5.6.0 anyways). \
 \
It is a harmless no-op to use this module on 5.9.5+. That is to say, code \
which properly uses MRO::Compat will work unmodified on both older Perls \
and 5.9.5+. \
 \
If you're writing a piece of software that would like to use the parts of \
5.9.5+'s mro:: interfaces that are supported here, and you want \
compatibility with older Perls, this is the module for you. \
 \
Some parts of this code will work better and/or faster with Class::C3::XS \
installed (which is an optional prereq of Class::C3, which is in turn a \
prereq of this package), but it's not a requirement. \
 \
This module never exports any functions. All calls must be fully qualified \
with the 'mro::' prefix. \
 \
The interface documentation here serves only as a quick reference of what \
the function basically does, and what differences between MRO::Compat and \
5.9.5+ one should look out for. The main docs in 5.9.5's mro are the real \
interface docs, and contain a lot of other useful information."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.15"

RPM_NAME = "perl-MRO-Compat-0.15-1.9.noarch.rpm"
RPM_HASH = "154ebb272c6c69c41a63ec367d64538d03cacc86abf2de0e688304d118c86a22e78b3a773837489abfc03c02d5aefcb8bd370036a8037d86a939f62cb82bf129"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-MRO--Compat \
perl-MRO-Compat"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.38.0"

inherit rpm
