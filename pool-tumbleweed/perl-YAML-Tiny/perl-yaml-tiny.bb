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

RPM_NAME = "perl-YAML-Tiny-1.74-1.3.noarch.rpm"
RPM_HASH = "27e1b633ed7b9734151ad82d37c0cbc416f2448b004de819fb337ff72d6246841a7c5bf3042e361e1b91773dc4ef8c9b6bc95ba223e7f567492ef934225115d2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-YAML--Tiny \
perl-YAML-Tiny"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.38.0"

inherit rpm
