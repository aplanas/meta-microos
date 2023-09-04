SUMMARY = "An exporter with the features of Sub::Exporter but only core dependencies"
DESCRIPTION = "Exporter::Tiny supports many of Sub::Exporter's external-facing features \
including renaming imported functions with the '-as', '-prefix' and \
'-suffix' options; explicit destinations with the 'into' option; and \
alternative installers with the 'installer' option. But it's written in \
only about 40% as many lines of code and with zero non-core dependencies. \
 \
Its internal-facing interface is closer to Exporter.pm, with configuration \
done through the '@EXPORT', '@EXPORT_OK' and '%EXPORT_TAGS' package \
variables. \
 \
If you are trying to *write* a module that inherits from Exporter::Tiny, \
then look at: \
 \
  * Exporter::Tiny::Manual::QuickStart \
 \
  * Exporter::Tiny::Manual::Exporting \
 \
If you are trying to *use* a module that inherits from Exporter::Tiny, then \
look at: \
 \
  * Exporter::Tiny::Manual::Importing"
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "1.006002"

RPM_NAME = "perl-Exporter-Tiny-1.006002-1.3.noarch.rpm"
RPM_HASH = "203470baf93d7e801dc2654d9b2d87a975697f0fe38d7656275819ce926c281141b69b59027a3d46c5e479f3fe261a41dba6ccbfbc506291e0507cbb226ec490"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Exporter--Shiny \
perl-Exporter--Tiny \
perl-Exporter-Tiny"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.38.0"

inherit rpm
