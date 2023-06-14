SUMMARY = "Lightweight exporting of functions and variables"
DESCRIPTION = "Exporter::Lite is an alternative to Exporter, intended to provide a \
lightweight subset of the most commonly-used functionality. It supports \
'import()', '@EXPORT' and '@EXPORT_OK' and not a whole lot else. \
 \
Exporter::Lite simply exports its import() function into your namespace. \
This might be called a 'mix-in' or a 'role'. \
 \
When 'Exporter::Lite' was written, if you wanted to use 'Exporter' you had \
to write something like this: \
 \
 use Exporter; \
 our @ISA = qw/ Exporter /; \
 \
'Exporter::Lite' saved you from writing that second line. But since before \
2010 you've been able to write: \
 \
 use Exporter qw/ import /; \
 \
Which imports the 'import' function into your namespace from 'Exporter'. As \
a result, I would recommend that you use 'Exporter' now, as it's a core \
module (shipped with Perl). \
 \
To make sure you get a version of 'Exporter' that supports the above usage, \
specify a minimum version when you 'use' it: \
 \
 use Exporter 5.57 qw/ import /;"
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.09"

RPM_NAME = "perl-Exporter-Lite-0.09-1.7.noarch.rpm"
RPM_HASH = "dcd4577ae115e9ca92708abd6c46180e2cd563fff88cb44d334be50ba864bb6ef572601c8bf69fd624245896bee6af436549c50a742e9ed6482836ff01c614ea"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Exporter--Lite \
perl-Exporter-Lite"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.0"

inherit rpm
