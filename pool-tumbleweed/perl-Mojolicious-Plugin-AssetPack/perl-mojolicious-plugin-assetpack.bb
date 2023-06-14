SUMMARY = "Compress and convert CSS, Less, Sass, JavaScript and CoffeeScript files"
DESCRIPTION = "Mojolicious::Plugin::AssetPack is a Mojolicious plugin for processing \
static assets. The idea is that JavaScript and CSS files should be served \
as one minified file to save bandwidth and roundtrip time to the server. \
 \
There are many external tools for doing this, but integrating them with \
Mojolicious can be a struggle: You want to serve the source files directly \
while developing, but a minified version in production. This assetpack \
plugin will handle all of that automatically for you. \
 \
Your application creates and refers to an asset by its topic (virtual asset \
name). The process of building actual assets from their components is \
delegated to 'pipe objects'."
LICENSE = "Artistic-2.0"

PV = "2.14"

RPM_NAME = "perl-Mojolicious-Plugin-AssetPack-2.14-1.1.noarch.rpm"
RPM_HASH = "10d5ca2afda8d38690b757ecee570f43b6379153cac3b13e86655ace03974cb98b19323690946a964a5d37978d10bf995bebdcf099c1021d92cd4363c4ff81f5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Mojolicious--Plugin--AssetPack \
perl-Mojolicious--Plugin--AssetPack--Asset \
perl-Mojolicious--Plugin--AssetPack--Asset--Null \
perl-Mojolicious--Plugin--AssetPack--Pipe \
perl-Mojolicious--Plugin--AssetPack--Pipe--CoffeeScript \
perl-Mojolicious--Plugin--AssetPack--Pipe--Combine \
perl-Mojolicious--Plugin--AssetPack--Pipe--Css \
perl-Mojolicious--Plugin--AssetPack--Pipe--Favicon \
perl-Mojolicious--Plugin--AssetPack--Pipe--Fetch \
perl-Mojolicious--Plugin--AssetPack--Pipe--JavaScript \
perl-Mojolicious--Plugin--AssetPack--Pipe--Jpeg \
perl-Mojolicious--Plugin--AssetPack--Pipe--Less \
perl-Mojolicious--Plugin--AssetPack--Pipe--Png \
perl-Mojolicious--Plugin--AssetPack--Pipe--Riotjs \
perl-Mojolicious--Plugin--AssetPack--Pipe--RollupJs \
perl-Mojolicious--Plugin--AssetPack--Pipe--Sass \
perl-Mojolicious--Plugin--AssetPack--Pipe--TypeScript \
perl-Mojolicious--Plugin--AssetPack--Pipe--Vuejs \
perl-Mojolicious--Plugin--AssetPack--Store \
perl-Mojolicious--Plugin--AssetPack--Util \
perl-Mojolicious--Plugin--AssetPack--Util---chdir \
perl-Mojolicious-Plugin-AssetPack"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.0 \
perl-File--Which \
perl-IPC--Run3 \
perl-Mojolicious"

inherit rpm
