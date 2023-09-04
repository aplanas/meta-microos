SUMMARY = "Type constraints and coercions for Perl"
DESCRIPTION = "The 'Specio' distribution provides classes for representing type \
constraints and coercion, along with syntax sugar for declaring them. \
 \
Note that this is not a proper type system for Perl. Nothing in this \
distribution will magically make the Perl interpreter start checking a \
value's type on assignment to a variable. In fact, there's no built-in way \
to apply a type to a variable at all. \
 \
Instead, you can explicitly check a value against a type, and optionally \
coerce values to that type. \
 \
My long-term goal is to replace Moose's built-in types and MooseX::Types \
with this module."
LICENSE = "Artistic-2.0"

PV = "0.48"

RPM_NAME = "perl-Specio-0.48-1.6.noarch.rpm"
RPM_HASH = "51d1eaacb403776bb5d84f8d40146b3c2966cf7640c10bda8b2ed42adcb538a24e8cf6bdb096ff3b2d744f10be86cf7dc4cbfdbc22b6717b441b92e223c8ab42"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl--T--ArrayOverload \
perl--T--BoolOverload \
perl--T--CodeOverload \
perl--T--GlobOverload \
perl--T--HashOverload \
perl--T--NumOverload \
perl--T--RegexOverload \
perl--T--ScalarOverload \
perl--T--StrOverload \
perl--T--Thing \
perl-Specio \
perl-Specio--Coercion \
perl-Specio--Constraint--AnyCan \
perl-Specio--Constraint--AnyDoes \
perl-Specio--Constraint--AnyIsa \
perl-Specio--Constraint--Enum \
perl-Specio--Constraint--Intersection \
perl-Specio--Constraint--ObjectCan \
perl-Specio--Constraint--ObjectDoes \
perl-Specio--Constraint--ObjectIsa \
perl-Specio--Constraint--Parameterizable \
perl-Specio--Constraint--Parameterized \
perl-Specio--Constraint--Role--CanType \
perl-Specio--Constraint--Role--DoesType \
perl-Specio--Constraint--Role--Interface \
perl-Specio--Constraint--Role--IsaType \
perl-Specio--Constraint--Simple \
perl-Specio--Constraint--Structurable \
perl-Specio--Constraint--Structured \
perl-Specio--Constraint--Union \
perl-Specio--Declare \
perl-Specio--DeclaredAt \
perl-Specio--Exception \
perl-Specio--Exporter \
perl-Specio--Helpers \
perl-Specio--Library--Builtins \
perl-Specio--Library--Numeric \
perl-Specio--Library--Perl \
perl-Specio--Library--String \
perl-Specio--Library--Structured \
perl-Specio--Library--Structured--Dict \
perl-Specio--Library--Structured--Map \
perl-Specio--Library--Structured--Tuple \
perl-Specio--OO \
perl-Specio--PartialDump \
perl-Specio--Registry \
perl-Specio--Role--Inlinable \
perl-Specio--Subs \
perl-Specio--TypeChecks \
perl-Test--Specio"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.38.0 \
perl-Devel--StackTrace \
perl-Eval--Closure \
perl-List--Util \
perl-MRO--Compat \
perl-Module--Runtime \
perl-Role--Tiny \
perl-Role--Tiny--With \
perl-Sub--Quote \
perl-Test--Fatal \
perl-Test--More \
perl-Try--Tiny \
perl-XString \
perl-parent \
perl-version"

inherit rpm
