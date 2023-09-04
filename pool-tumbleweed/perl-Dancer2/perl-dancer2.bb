SUMMARY = "Lightweight yet powerful web application framework"
DESCRIPTION = "Dancer2 is the new generation of Dancer, the lightweight web-framework for \
Perl. Dancer2 is a complete rewrite based on Moo. \
 \
Dancer2 can optionally use XS modules for speed, but at its core remains \
fatpackable (packable by App::FatPacker) so you could easily deploy Dancer2 \
applications on hosts that do not support custom CPAN modules. \
 \
Dancer2 is easy and fun: \
 \
    use Dancer2; \
    get '/' => sub { 'Hello World' }; \
    dance; \
 \
This is the main module for the Dancer2 distribution. It contains logic for \
creating a new Dancer2 application."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.400001"

RPM_NAME = "perl-Dancer2-0.400001-1.3.noarch.rpm"
RPM_HASH = "560b37e80ce6f2f10440029220187264832c28821b43c46b4968fa447bf538c6a975c26c9f3e907659762ad8a4390ac8d444d2587f16e51a8d45d821de813e0e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Dancer2 \
perl-Dancer2--CLI \
perl-Dancer2--CLI--Gen \
perl-Dancer2--CLI--Version \
perl-Dancer2--Core \
perl-Dancer2--Core--App \
perl-Dancer2--Core--Cookie \
perl-Dancer2--Core--DSL \
perl-Dancer2--Core--Dispatcher \
perl-Dancer2--Core--Error \
perl-Dancer2--Core--Factory \
perl-Dancer2--Core--HTTP \
perl-Dancer2--Core--Hook \
perl-Dancer2--Core--MIME \
perl-Dancer2--Core--Request \
perl-Dancer2--Core--Request--Upload \
perl-Dancer2--Core--Response \
perl-Dancer2--Core--Response--Delayed \
perl-Dancer2--Core--Role--ConfigReader \
perl-Dancer2--Core--Role--DSL \
perl-Dancer2--Core--Role--Engine \
perl-Dancer2--Core--Role--Handler \
perl-Dancer2--Core--Role--HasLocation \
perl-Dancer2--Core--Role--Hookable \
perl-Dancer2--Core--Role--Logger \
perl-Dancer2--Core--Role--Serializer \
perl-Dancer2--Core--Role--SessionFactory \
perl-Dancer2--Core--Role--SessionFactory--File \
perl-Dancer2--Core--Role--StandardResponses \
perl-Dancer2--Core--Role--Template \
perl-Dancer2--Core--Route \
perl-Dancer2--Core--Runner \
perl-Dancer2--Core--Session \
perl-Dancer2--Core--Time \
perl-Dancer2--Core--Types \
perl-Dancer2--FileUtils \
perl-Dancer2--Handler--AutoPage \
perl-Dancer2--Handler--File \
perl-Dancer2--Logger--Capture \
perl-Dancer2--Logger--Capture--Trap \
perl-Dancer2--Logger--Console \
perl-Dancer2--Logger--Diag \
perl-Dancer2--Logger--File \
perl-Dancer2--Logger--Note \
perl-Dancer2--Logger--Null \
perl-Dancer2--Plugin \
perl-Dancer2--Serializer--Dumper \
perl-Dancer2--Serializer--JSON \
perl-Dancer2--Serializer--Mutable \
perl-Dancer2--Serializer--YAML \
perl-Dancer2--Session--Simple \
perl-Dancer2--Session--YAML \
perl-Dancer2--Template--Implementation--ForkedTiny \
perl-Dancer2--Template--Simple \
perl-Dancer2--Template--TemplateToolkit \
perl-Dancer2--Template--Tiny \
perl-Dancer2--Test"

RDEPENDS:${PN} += "/usr/bin/env \
perl--MODULE-COMPAT-5.38.0 \
perl-CLI--Osprey \
perl-Clone \
perl-Config--Any \
perl-Digest--SHA \
perl-Exporter--Tiny \
perl-File--Share \
perl-File--Which \
perl-HTTP--Date \
perl-HTTP--Headers--Fast \
perl-HTTP--Tiny \
perl-Hash--Merge--Simple \
perl-Hash--MultiValue \
perl-Import--Into \
perl-JSON--MaybeXS \
perl-List--Util \
perl-MIME--Base64 \
perl-Module--Runtime \
perl-Moo \
perl-Moo--Role \
perl-Path--Tiny \
perl-Plack \
perl-Plack--Middleware--FixMissingBodyInRedirect \
perl-Plack--Middleware--RemoveRedundantBody \
perl-Ref--Util \
perl-Safe--Isa \
perl-Sub--Quote \
perl-Template \
perl-Template--Tiny \
perl-Test--More \
perl-Type--Tiny \
perl-Types--Standard \
perl-URI--Escape \
perl-YAML \
perl-parent"

inherit rpm
