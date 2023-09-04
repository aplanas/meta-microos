SUMMARY = "Export shared globs with Sub::Exporter collectors"
DESCRIPTION = "Sub::Exporter::GlobExporter provides only one routine, 'glob_exporter', \
which may be called either by its full name or may be imported on request. \
 \
  my $exporter = glob_exporter( $default_name, $globref_locator ); \
 \
The routine returns a collection validator that will export a glob into the \
importing package. It will export it under the name '$default_name', unless \
an alternate name is given (as shown above). The glob that is installed is \
specified by the '$globref_locator', which can be either the globref \
itself, or a reference to a string which will be called on the exporter \
 \
For an example, see the SYNOPSIS, in which a method is defined to produce \
the globref to share. This allows the glob-exporting package to be \
subclassed, so the subclass may choose to either re-use the same glob when \
exporting or to export a new one. \
 \
If there are entries in the arguments to the globref-exporting collector \
_other_ than those beginning with a dash, a hashref of them will be passed \
to the globref locator. In other words, if we were to write this: \
 \
  use Shared::Symbol '$Symbol' => { arg => 1, -as => 2 }; \
 \
It would result in a call like the following: \
 \
  my $globref = Shared::Symbol->_shared_globref({ arg => 1 });"
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.006"

RPM_NAME = "perl-Sub-Exporter-GlobExporter-0.006-1.4.noarch.rpm"
RPM_HASH = "6151fd69620894792485c460f7350d849443571f857b4cdf6a37cbea18caaddcf5d09421b089059dbc787559c0c3972e207c12d2867af698dbc827f66dd11e3e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Sub--Exporter--GlobExporter \
perl-Sub-Exporter-GlobExporter"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.38.0 \
perl-Sub--Exporter"

inherit rpm
