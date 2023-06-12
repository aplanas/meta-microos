SUMMARY = "Perl Archive Toolkit"
DESCRIPTION = "This module lets you use special zip files, called *P*erl *Ar*chives, as \
libraries from which Perl modules can be loaded. \
 \
It supports loading XS modules by overriding *DynaLoader* bootstrapping \
methods; it writes shared object file to a temporary file at the time it is \
needed. \
 \
A _.par_ file is mostly a zip of the _blib/_ directory after the build \
process of a CPAN distribution. To generate a _.par_ file yourself, all you \
have to do is compress the modules under _arch/_ and _lib/_, e.g.: \
 \
    % perl Makefile.PL \
    % make \
    % cd blib \
    % zip -r mymodule.par arch/ lib/ \
 \
Afterward, you can just use _mymodule.par_ anywhere in your '@INC', use \
*PAR*, and it will Just Work. Support for generating _.par_ files is going \
to be in the next (beyond 0.2805) release of Module::Build. \
 \
For convenience, you can set the 'PERL5OPT' environment variable to '-MPAR' \
to enable 'PAR' processing globally (the overhead is small if not used); \
setting it to '-MPAR=/path/to/mylib.par' will load a specific PAR file. \
Alternatively, consider using the _par.pl_ utility bundled with the \
PAR::Packer distribution, or using the self-contained _parl_ utility which \
is also distributed with PAR::Packer on machines without PAR.pm installed. \
 \
Note that self-containing scripts and executables created with _par.pl_ and \
_pp_ may also be used as _.par_ archives: \
 \
    % pp -o packed.exe source.pl        # generate packed.exe (see PAR::Packer) \
    % perl -MPAR=packed.exe other.pl    # this also works \
    % perl -MPAR -Ipacked.exe other.pl  # ditto \
 \
Please see SYNOPSIS for most typical use cases."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "1.018"

RPM_NAME = "perl-PAR-1.018-1.2.noarch.rpm"
RPM_HASH = "0f35bbf8b3b8e9b3046772308bb6b7663e753ca13ad7646b7a95cdcc3c25ceeedbbf61b6924b14e0dfb048b3e8a103092acd25db31f2ede3e833d363fed7b1fc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl(PAR) \
perl(PAR::Heavy) \
perl(PAR::SetupProgname) \
perl(PAR::SetupTemp) \
perl-PAR"
RDEPENDS:${PN} += "perl(:MODULE_COMPAT_5.36.0) \
perl(Archive::Zip) \
perl(AutoLoader) \
perl(Compress::Zlib) \
perl(Digest::SHA) \
perl(PAR::Dist)"

inherit rpm