SUMMARY = "Generate common types of methods"
DESCRIPTION = "The Class::MakeMethods framework allows Perl class developers to quickly \
define common types of methods. When a module uses Class::MakeMethods or \
one of its subclasses, it can select from a variety of supported method \
types, and specify a name for each method desired. The methods are \
dynamically generated and installed in the calling package."
LICENSE = "GPL-1.0+ | Artistic-1.0"

PV = "1.01"

RPM_NAME = "perl-Class-MakeMethods-1.01-9.25.noarch.rpm"
RPM_HASH = "e1eef495fb618252c6de55d66e7e85080a89b1e3f28be3e771b93d864ba08196e36eb12d9f44c7939f9e97f51b99b6cfdebe74d243b3ee956a4e1d3de7fd9418"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Class--MakeMethods \
perl-Class--MakeMethods--Attribute \
perl-Class--MakeMethods--Autoload \
perl-Class--MakeMethods--Basic \
perl-Class--MakeMethods--Basic--Array \
perl-Class--MakeMethods--Basic--Global \
perl-Class--MakeMethods--Basic--Hash \
perl-Class--MakeMethods--Composite \
perl-Class--MakeMethods--Composite--Array \
perl-Class--MakeMethods--Composite--Global \
perl-Class--MakeMethods--Composite--Hash \
perl-Class--MakeMethods--Composite--Inheritable \
perl-Class--MakeMethods--Composite--Universal \
perl-Class--MakeMethods--Emulator \
perl-Class--MakeMethods--Emulator--AccessorFast \
perl-Class--MakeMethods--Emulator--Inheritable \
perl-Class--MakeMethods--Emulator--MethodMaker \
perl-Class--MakeMethods--Emulator--Singleton \
perl-Class--MakeMethods--Emulator--Struct \
perl-Class--MakeMethods--Emulator--accessors \
perl-Class--MakeMethods--Emulator--accessors--chained \
perl-Class--MakeMethods--Emulator--accessors--classic \
perl-Class--MakeMethods--Emulator--mcoder \
perl-Class--MakeMethods--Evaled \
perl-Class--MakeMethods--Evaled--Hash \
perl-Class--MakeMethods--Standard \
perl-Class--MakeMethods--Standard--Array \
perl-Class--MakeMethods--Standard--Global \
perl-Class--MakeMethods--Standard--Hash \
perl-Class--MakeMethods--Standard--Inheritable \
perl-Class--MakeMethods--Standard--Universal \
perl-Class--MakeMethods--Template \
perl-Class--MakeMethods--Template--Array \
perl-Class--MakeMethods--Template--Class \
perl-Class--MakeMethods--Template--ClassInherit \
perl-Class--MakeMethods--Template--ClassName \
perl-Class--MakeMethods--Template--ClassVar \
perl-Class--MakeMethods--Template--Flyweight \
perl-Class--MakeMethods--Template--Generic \
perl-Class--MakeMethods--Template--Global \
perl-Class--MakeMethods--Template--Hash \
perl-Class--MakeMethods--Template--Inheritable \
perl-Class--MakeMethods--Template--InsideOut \
perl-Class--MakeMethods--Template--PackageVar \
perl-Class--MakeMethods--Template--Ref \
perl-Class--MakeMethods--Template--Scalar \
perl-Class--MakeMethods--Template--Static \
perl-Class--MakeMethods--Template--Struct \
perl-Class--MakeMethods--Template--StructBuiltin \
perl-Class--MakeMethods--Template--Universal \
perl-Class--MakeMethods--Utility--ArraySplicer \
perl-Class--MakeMethods--Utility--DiskCache \
perl-Class--MakeMethods--Utility--Inheritable \
perl-Class--MakeMethods--Utility--Ref \
perl-Class--MakeMethods--Utility--TextBuilder \
perl-Class-MakeMethods"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.1"

inherit rpm
