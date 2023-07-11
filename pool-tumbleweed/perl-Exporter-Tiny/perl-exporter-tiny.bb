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

RPM_NAME = "perl-Exporter-Tiny-1.006002-1.2.noarch.rpm"
RPM_HASH = "6ee4e616bbbf706be98d1144ae903634e8c8ba2a41c2d0e17b2c9f511564f30fa41e6bd70c2ed44ea0180de50a6f860461c8f4a16afbc70698a743018883a4f5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Exporter--Shiny \
perl-Exporter--Tiny \
perl-Exporter-Tiny"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.1"

inherit rpm
