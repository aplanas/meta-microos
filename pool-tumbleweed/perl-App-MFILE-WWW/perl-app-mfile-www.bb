SUMMARY = "Web UI development toolkit with prototype demo app"
DESCRIPTION = "This distro contains a foundation/framework/toolkit for developing the \
'front end' portion of web applications. \
 \
App::MFILE::WWW is a Plack application that provides a HTTP \
request-response handler (based on Web::Machine), CSS and HTML source code \
for an in-browser 'screen', and JavaScript code for displaying various \
'widgets' (menus, forms, etc.) in that screen and for processing user input \
from within those widgets. \
 \
In addition, infrastructure is included (but need not be used) for user \
authentication, session management, and communication with a backend server \
via AJAX calls. \
 \
Front ends built with App::MFILE::WWW will typicaly be menu-driven, \
consisting exclusively of fixed-width Unicode text, and capable of being \
controlled from the keyboard, without the use of a mouse. The overall \
look-and-feel is reminiscent of the text terminal era. \
 \
The distro comes with a prototype (demo) application to illustrate how the \
various widgets are used."
LICENSE = "BSD-3-Clause"

PV = "0.176"

RPM_NAME = "perl-App-MFILE-WWW-0.176-1.19.noarch.rpm"
RPM_HASH = "6a0ab15b9f3e67d832894c45cb21904a64be5b560d28fb1fef5cd1653b843071ec77c31a4b188dbfc262bbd4236122ca5be1d1a30ed4d5aa2016bbfff1575e41"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl(App::MFILE::WWW) \
perl(App::MFILE::WWW::Dispatch) \
perl(App::MFILE::WWW::Resource) \
perl-App-MFILE-WWW"
RDEPENDS:${PN} += "/usr/bin/perl \
perl(:MODULE_COMPAT_5.36.0) \
perl(App::CELL) \
perl(File::ShareDir) \
perl(JSON) \
perl(LWP::UserAgent) \
perl(Log::Any::Adapter) \
perl(Params::Validate) \
perl(Plack::Builder) \
perl(Plack::Middleware::Session) \
perl(Plack::Middleware::StackTrace) \
perl(Plack::Middleware::Static) \
perl(Plack::Runner) \
perl(Try::Tiny) \
perl(Web::Machine)"

inherit rpm
