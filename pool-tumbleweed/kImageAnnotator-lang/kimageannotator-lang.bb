SUMMARY = "Translations for package kImageAnnotator"
DESCRIPTION = "Provides translations for the 'kImageAnnotator' package."
LICENSE = "GPL-2.0-or-later"

PV = "0.6.1"

RPM_NAME = "kImageAnnotator-lang-0.6.1-1.2.noarch.rpm"
RPM_HASH = "17004d2602848092124ce7a2493b051ef05c13d6f1eb16eb61099befd869e787ade03d1b7c7016d645b93959a4bf130798622b00141a4d75c211e6c516d52910"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kImageAnnotator-lang \
kImageAnnotator-lang-all"

RDEPENDS:${PN} += "kImageAnnotator"

inherit rpm
