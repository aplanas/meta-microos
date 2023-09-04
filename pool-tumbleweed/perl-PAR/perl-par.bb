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

RPM_NAME = "perl-PAR-1.018-1.4.noarch.rpm"
RPM_HASH = "9be7b6d886a17ab7f2f721db44762476d840df9d373a751655532399cde7a53cfb0a71ab325610fe8f6c7f2c49b107f3120cdff7496b2e5fdaacb666cbbf5f93"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-PAR \
perl-PAR--Heavy \
perl-PAR--SetupProgname \
perl-PAR--SetupTemp"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.38.0 \
perl-Archive--Zip \
perl-AutoLoader \
perl-Compress--Zlib \
perl-Digest--SHA \
perl-PAR--Dist"

inherit rpm
