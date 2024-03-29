SUMMARY = "Real-time web framework"
DESCRIPTION = "An amazing real-time web framework built on top of the powerful Mojo web \
development toolkit. With support for RESTful routes, plugins, commands, \
Perl-ish templates, content negotiation, session management, form \
validation, testing framework, static file server, 'CGI'/'PSGI' detection, \
first class Unicode support and much more for you to discover. \
 \
Take a look at our excellent documentation in Mojolicious::Guides!"
LICENSE = "Artistic-2.0"

PV = "9.33"

RPM_NAME = "perl-Mojolicious-9.33-1.2.noarch.rpm"
RPM_HASH = "465f58267a4ac3c1ddfbd38fbe0ad7f2c0f58f7ca60e6cc1b53da4ac41765508f53ef5e609e05c65173cf9e9874e39315cb8ce3444121d19e20f8eb2e182186d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Mojo \
perl-Mojo--Asset \
perl-Mojo--Asset--File \
perl-Mojo--Asset--Memory \
perl-Mojo--Base \
perl-Mojo--ByteStream \
perl-Mojo--Cache \
perl-Mojo--Collection \
perl-Mojo--Content \
perl-Mojo--Content--MultiPart \
perl-Mojo--Content--Single \
perl-Mojo--Cookie \
perl-Mojo--Cookie--Request \
perl-Mojo--Cookie--Response \
perl-Mojo--DOM \
perl-Mojo--DOM--CSS \
perl-Mojo--DOM--HTML \
perl-Mojo--Date \
perl-Mojo--DynamicMethods \
perl-Mojo--EventEmitter \
perl-Mojo--Exception \
perl-Mojo--File \
perl-Mojo--Headers \
perl-Mojo--HelloWorld \
perl-Mojo--Home \
perl-Mojo--IOLoop \
perl-Mojo--IOLoop--Client \
perl-Mojo--IOLoop--Server \
perl-Mojo--IOLoop--Stream \
perl-Mojo--IOLoop--Subprocess \
perl-Mojo--IOLoop--TLS \
perl-Mojo--JSON \
perl-Mojo--JSON--Pointer \
perl-Mojo--Loader \
perl-Mojo--Log \
perl-Mojo--Log---Capture \
perl-Mojo--Message \
perl-Mojo--Message--Request \
perl-Mojo--Message--Response \
perl-Mojo--Parameters \
perl-Mojo--Path \
perl-Mojo--Promise \
perl-Mojo--Reactor \
perl-Mojo--Reactor--EV \
perl-Mojo--Reactor--Poll \
perl-Mojo--Server \
perl-Mojo--Server--CGI \
perl-Mojo--Server--Daemon \
perl-Mojo--Server--Hypnotoad \
perl-Mojo--Server--Morbo \
perl-Mojo--Server--Morbo--Backend \
perl-Mojo--Server--Morbo--Backend--Poll \
perl-Mojo--Server--PSGI \
perl-Mojo--Server--PSGI---IO \
perl-Mojo--Server--Prefork \
perl-Mojo--Template \
perl-Mojo--Transaction \
perl-Mojo--Transaction--HTTP \
perl-Mojo--Transaction--WebSocket \
perl-Mojo--URL \
perl-Mojo--Upload \
perl-Mojo--UserAgent \
perl-Mojo--UserAgent--CookieJar \
perl-Mojo--UserAgent--Proxy \
perl-Mojo--UserAgent--Server \
perl-Mojo--UserAgent--Transactor \
perl-Mojo--Util \
perl-Mojo--Util---Guard \
perl-Mojo--WebSocket \
perl-Mojolicious \
perl-Mojolicious--Command \
perl-Mojolicious--Command--Author--cpanify \
perl-Mojolicious--Command--Author--generate \
perl-Mojolicious--Command--Author--generate--app \
perl-Mojolicious--Command--Author--generate--dockerfile \
perl-Mojolicious--Command--Author--generate--lite-app \
perl-Mojolicious--Command--Author--generate--makefile \
perl-Mojolicious--Command--Author--generate--plugin \
perl-Mojolicious--Command--Author--inflate \
perl-Mojolicious--Command--cgi \
perl-Mojolicious--Command--daemon \
perl-Mojolicious--Command--eval \
perl-Mojolicious--Command--get \
perl-Mojolicious--Command--prefork \
perl-Mojolicious--Command--psgi \
perl-Mojolicious--Command--routes \
perl-Mojolicious--Command--version \
perl-Mojolicious--Commands \
perl-Mojolicious--Controller \
perl-Mojolicious--Lite \
perl-Mojolicious--Plugin \
perl-Mojolicious--Plugin--Config \
perl-Mojolicious--Plugin--DefaultHelpers \
perl-Mojolicious--Plugin--EPLRenderer \
perl-Mojolicious--Plugin--EPRenderer \
perl-Mojolicious--Plugin--HeaderCondition \
perl-Mojolicious--Plugin--JSONConfig \
perl-Mojolicious--Plugin--Mount \
perl-Mojolicious--Plugin--NotYAMLConfig \
perl-Mojolicious--Plugin--TagHelpers \
perl-Mojolicious--Plugins \
perl-Mojolicious--Renderer \
perl-Mojolicious--Routes \
perl-Mojolicious--Routes--Match \
perl-Mojolicious--Routes--Pattern \
perl-Mojolicious--Routes--Route \
perl-Mojolicious--Sessions \
perl-Mojolicious--Static \
perl-Mojolicious--Types \
perl-Mojolicious--Validator \
perl-Mojolicious--Validator--Validation \
perl-Test--Mojo \
perl-ojo"

RDEPENDS:${PN} += "/usr/bin/perl \
perl--MODULE-COMPAT-5.38.0 \
perl-IO--Socket--IP \
perl-Sub--Util"

inherit rpm
