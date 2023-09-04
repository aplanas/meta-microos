SUMMARY = "Alternative handles_via implementation"
DESCRIPTION = "If you've used Moose's native attribute traits, or MooX::HandlesVia before, \
you should have a fairly good idea what this does. \
 \
Why re-invent the wheel? Well, this is an implementation that should work \
okay with Moo, Moose, Mouse, and any other OO toolkit you throw at it. One \
ring to rule them all, so to speak. \
 \
For details of how to use it, see the manual. \
 \
* Sub::HandlesVia::Manual::WithMoo \
 \
How to use Sub::HandlesVia with Moo and Moo::Role. \
 \
* Sub::HandlesVia::Manual::WithMoose \
 \
How to use Sub::HandlesVia with Moose and Moose::Role. \
 \
* Sub::HandlesVia::Manual::WithMouse \
 \
How to use Sub::HandlesVia with Mouse and Mouse::Role. \
 \
* Sub::HandlesVia::Manual::WithMite \
 \
How to use Sub::HandlesVia with Mite. \
 \
* Sub::HandlesVia::Manual::WithClassTiny \
 \
How to use Sub::HandlesVia with Class::Tiny. \
 \
* Sub::HandlesVia::Manual::WithObjectPad \
 \
How to use Sub::HandlesVia with Object::Pad classes. \
 \
* Sub::HandlesVia::Manual::WithGeneric \
 \
How to use Sub::HandlesVia with other OO toolkits, and hand-written Perl \
classes. \
 \
Note: as Sub::HandlesVia needs to detect which toolkit you are using, and \
often needs to detect whether your package is a class or a role, it needs \
to be loaded _after_ Moo/Moose/Mouse/etc. Your 'use Moo' or 'use \
Moose::Role' or whatever needs to be _before_ your 'use Sub::HandlesVia'."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.050000"

RPM_NAME = "perl-Sub-HandlesVia-0.050000-1.3.noarch.rpm"
RPM_HASH = "e4665ffa711bf907bf718d7cc537be02ffd82e3445d49c124abbf3ef02853c9915848b03d5f7628b32f92279adcef2bc009b23d9c507c41285d806963a91d695"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Sub--HandlesVia \
perl-Sub--HandlesVia--CodeGenerator \
perl-Sub--HandlesVia--Declare \
perl-Sub--HandlesVia--Handler \
perl-Sub--HandlesVia--Handler--CodeRef \
perl-Sub--HandlesVia--Handler--Traditional \
perl-Sub--HandlesVia--HandlerLibrary \
perl-Sub--HandlesVia--HandlerLibrary--Array \
perl-Sub--HandlesVia--HandlerLibrary--Blessed \
perl-Sub--HandlesVia--HandlerLibrary--Bool \
perl-Sub--HandlesVia--HandlerLibrary--Code \
perl-Sub--HandlesVia--HandlerLibrary--Counter \
perl-Sub--HandlesVia--HandlerLibrary--Enum \
perl-Sub--HandlesVia--HandlerLibrary--Hash \
perl-Sub--HandlesVia--HandlerLibrary--Number \
perl-Sub--HandlesVia--HandlerLibrary--Scalar \
perl-Sub--HandlesVia--HandlerLibrary--String \
perl-Sub--HandlesVia--Mite \
perl-Sub--HandlesVia--Toolkit \
perl-Sub--HandlesVia--Toolkit--Mite \
perl-Sub--HandlesVia--Toolkit--Moo \
perl-Sub--HandlesVia--Toolkit--Moose \
perl-Sub--HandlesVia--Toolkit--Moose--PackageTrait \
perl-Sub--HandlesVia--Toolkit--Moose--RoleTrait \
perl-Sub--HandlesVia--Toolkit--Mouse \
perl-Sub--HandlesVia--Toolkit--Mouse--PackageTrait \
perl-Sub--HandlesVia--Toolkit--Mouse--RoleTrait \
perl-Sub--HandlesVia--Toolkit--ObjectPad \
perl-Sub--HandlesVia--Toolkit--Plain \
perl-Sub-HandlesVia"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.38.0 \
perl-Class--Method--Modifiers \
perl-Exporter--Shiny \
perl-List--Util \
perl-Role--Hooks \
perl-Role--Tiny \
perl-Type--Tiny"

inherit rpm
