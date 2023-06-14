SUMMARY = "Read/Write YAML files with as little code as possible"
DESCRIPTION = "*YAML::Tiny* is a perl class for reading and writing YAML-style files, \
written with as little code as possible, reducing load time and memory \
overhead. \
 \
Most of the time it is accepted that Perl applications use a lot of memory \
and modules. The *::Tiny* family of modules is specifically intended to \
provide an ultralight and zero-dependency alternative to many more-thorough \
standard modules. \
 \
This module is primarily for reading human-written files (like simple \
config files) and generating very simple human-readable files. Note that I \
said *human-readable* and not *geek-readable*. The sort of files that your \
average manager or secretary should be able to look at and make sense of. \
 \
YAML::Tiny does not generate comments, it won't necessarily preserve the \
order of your hashes, and it will normalise if reading in and writing out \
again. \
 \
It only supports a very basic subset of the full YAML specification. \
 \
Usage is targeted at files like Perl's META.yml, for which a small and \
easily-embeddable module is extremely attractive. \
 \
Features will only be added if they are human readable, and can be written \
in a few lines of code. Please don't be offended if your request is \
refused. Someone has to draw the line, and for YAML::Tiny that someone is \
me. \
 \
If you need something with more power move up to YAML (7 megabytes of \
memory overhead) or YAML::XS (6 megabytes memory overhead and requires a C \
compiler). \
 \
To restate, YAML::Tiny does *not* preserve your comments, whitespace, or \
the order of your YAML data. But it should round-trip from Perl structure \
to file and back again just fine."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "1.74"

RPM_NAME = "perl-YAML-Tiny-1.74-1.1.noarch.rpm"
RPM_HASH = "cf5aa780cb1673abd9fffa05d02da1f7f695f4d43beefacac3bd85955bce51d5ee7503b4d7e9bcbe36b217a3064116ea27d90572038933a2a0c793fee3fca331"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-YAML--Tiny \
perl-YAML-Tiny"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.0"

inherit rpm
