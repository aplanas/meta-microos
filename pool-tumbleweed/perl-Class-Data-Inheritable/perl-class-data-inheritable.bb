SUMMARY = "Inheritable, overridable class data"
DESCRIPTION = "Class::Data::Inheritable is for creating accessor/mutators to class data. \
That is, if you want to store something about your class as a whole \
(instead of about a single object). This data is then inherited by your \
subclasses and can be overridden. \
 \
For example: \
 \
  Pere::Ubu->mk_classdata('Suitcase'); \
 \
will generate the method Suitcase() in the class Pere::Ubu. \
 \
This new method can be used to get and set a piece of class data. \
 \
  Pere::Ubu->Suitcase('Red'); \
  $suitcase = Pere::Ubu->Suitcase; \
 \
The interesting part happens when a class inherits from Pere::Ubu: \
 \
  package Raygun; \
  use base qw(Pere::Ubu); \
 \
   \
  $suitcase = Raygun->Suitcase; \
 \
Raygun inherits its Suitcase class data from Pere::Ubu. \
 \
Inheritance of class data works analogous to method inheritance. As long as \
Raygun does not 'override' its inherited class data (by using Suitcase() to \
set a new value) it will continue to use whatever is set in Pere::Ubu and \
inherit further changes: \
 \
   \
  Pere::Ubu->Suitcase('Blue'); \
 \
However, should Raygun decide to set its own Suitcase() it has now \
'overridden' Pere::Ubu and is on its own, just like if it had overridden a \
method: \
 \
   \
  Raygun->Suitcase('Orange'); \
 \
Now that Raygun has overridden Pere::Ubu further changes by Pere::Ubu no \
longer effect Raygun. \
 \
   \
  Pere::Ubu->Suitcase('Samsonite');"
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.09"

RPM_NAME = "perl-Class-Data-Inheritable-0.09-1.9.noarch.rpm"
RPM_HASH = "45babe8d33fd14620ecdbd80bc333998950c31f5bbf81d53015e5821585f023b408e329bd8efe6327abef66fff0926fc786b69494c2a695165da22268dbe5679"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Class--Data--Inheritable \
perl-Class-Data-Inheritable"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.0"

inherit rpm
